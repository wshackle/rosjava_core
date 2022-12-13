/*
 * This software is public domain software, however it is preferred
 * that the following disclaimers be attached.
 * Software Copywrite/Warranty Disclaimer
 * 
 * This software was developed at the National Institute of Standards and
 * Technology by employees of the Federal Government in the course of their
 * official duties. Pursuant to title 17 Section 105 of the United States
 * Code this software is not subject to copyright protection and is in the
 * public domain.
 * 
 * This software is experimental. NIST assumes no responsibility whatsoever 
 * for its use by other parties, and makes no guarantees, expressed or 
 * implied, about its quality, reliability, or any other characteristic. 
 * We would appreciate acknowledgement if the software is used. 
 * This software can be redistributed and/or modified freely provided 
 * that any derivative works bear some notice that they are derived from it, 
 * and any modified versions bear some notice that they have been modified.
 * 
 *  See http://www.copyright.gov/title17/92chap1.html#105
 * 
 */
package com.github.wshackle.generate.rosmessages.maven.plugin;

import com.google.common.collect.Lists;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.ros.internal.message.GenerateInterfaces;

/**
 * Goal which touches a timestamp file.
 */
@Mojo(name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES, requiresDependencyResolution = ResolutionScope.COMPILE, requiresDependencyCollection = ResolutionScope.COMPILE, threadSafe = true)
@SuppressWarnings({"initialization", "nullness"})
public class GenerateMojo
        extends AbstractMojo {

    /**
     * Location of the file.
     */
    @Parameter(defaultValue = "${project.build.directory}", property = "outputDir", required = true)
    private File outputDirectory;

    @Parameter(property = "generate.classname", defaultValue = "Copier")
    private String classname;

    @Parameter(property = "generate.packagename", defaultValue = "mypackage")
    private String packagename;

    @Parameter(property = "rospackagepath", defaultValue = ".", required = true)
    private String rospackagepath;

    @Parameter(property = "packageToGenerate", defaultValue = "my_msgs", required = true)
    private String packageToGenerate;

    @Override
    public void execute()
            throws MojoExecutionException {
        try {
            final Log log = getLog();

            log.info("outputDirectory=" + outputDirectory.getCanonicalPath());
            File genDirFile = new File(outputDirectory, "generated-sources");
            genDirFile.mkdirs();
            log.info("packageToGenerate=" + packageToGenerate);
            File pkgDirFile = new File(genDirFile,packageToGenerate);
            pkgDirFile.mkdirs();
//            File myPackageDirFile = new File(genDirFile, packagename);
//            myPackageDirFile.mkdirs();
//            File javaFile = new File(myPackageDirFile, classname +".java");
//            System.out.println("javaFile = " + javaFile);

            log.info("rospackagepath=" + rospackagepath);
            List<File> packagePath = new ArrayList<>();
            for (String path : rospackagepath.split(File.pathSeparator)) {
                File packageDirectory = new File(path);
                if (packageDirectory.exists() && packageDirectory.isDirectory()) {
                    packagePath.add(packageDirectory);
                } else{
                    log.error("rospackagepath contains "+path+" which is not a valid directory name");
                }
            }
            log.info("packageToGenerate=" + packageToGenerate);
            List<String> packagesNeeded = new ArrayList<>();
            packagesNeeded.add(packageToGenerate);
            
            GenerateInterfaces generateInterfaces = new GenerateInterfaces();

            generateInterfaces.generate(pkgDirFile, packagesNeeded, packagePath);

//            org.ros.internal.message.GenerateInterfaces.main(args);
//            try (PrintWriter pw = new PrintWriter(new FileWriter(javaFile))) {
//                pw.println("package "+packagename+";");
//                pw.println("");
//                pw.println("public class "+classname+" {");
//                pw.println("");
//                pw.println("}");
//                pw.println("");
//            }
        } catch (Exception ex) {
            Logger.getLogger(GenerateMojo.class.getName()).log(Level.SEVERE, "", ex);
            if (ex instanceof MojoExecutionException) {
                MojoExecutionException mojoExecutionException = (MojoExecutionException) ex;
                throw mojoExecutionException;
            } else {
                throw new MojoExecutionException("this=" + this.toString(), ex);
            }
        }
    }

    @Override
    public String toString() {
        return "GenerateMojo{" + "outputDirectory=" + outputDirectory + '}';
    }

}
