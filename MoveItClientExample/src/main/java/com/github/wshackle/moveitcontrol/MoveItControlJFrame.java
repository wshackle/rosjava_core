/*
 * This software is public domain software, however it is preferred
 * that the following disclaimers be attached.
 * Software Copyright/Warranty Disclaimer
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
package com.github.wshackle.moveitcontrol;

import geometry_msgs.Point;
import geometry_msgs.Pose;
import geometry_msgs.PoseStamped;
import geometry_msgs.Quaternion;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import moveit_msgs.GetPositionFKRequest;
import moveit_msgs.GetPositionFKResponse;
import org.ros.exception.RemoteException;
import org.ros.node.service.ServiceResponseListener;
import sensor_msgs.JointState;

/**
 *
 * @author Will Shackleford<william.shackleford@nist.gov>
 */
public class MoveItControlJFrame extends javax.swing.JFrame {

    public static void startMoveItControlJFrame(MoveItControlNodeMain moveItControlNodeMain) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new MoveItControlJFrame(moveItControlNodeMain).setVisible(true);
        });
    }
    /**
     * Creates new form MoveItControlJFrame
     */
    public MoveItControlJFrame() {
        this(null);
    }

    public MoveItControlJFrame(MoveItControlNodeMain moveItControlNodMain) {
        this.moveItControlNodMain = moveItControlNodMain;
        initComponents();
        if (null != moveItControlNodMain) {
            moveItControlNodMain.getJointStateSubscriber()
                    .addMessageListener((JointState jointState) -> {
                        try {
                            final double[] jointStatePositions = jointState.getPosition();
                            final List<String> jointStateNames = jointState.getName();
                            updateTableCurrentJointPositions(jointStateNames, jointStatePositions);
                            moveItControlNodMain.callForwardKinematicsService(jointState)
                                    .thenAccept((Pose pose) -> {
                                       updateCurrentPose(pose);
                                    });
                        } catch (Exception ex) {
                            Logger.getLogger(MoveItControlJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            throw new RuntimeException(ex);
                        } 
                    });
        }
    }

    private volatile Pose currentPose = null;

    private void updateCurrentPose(Pose pose) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            this.currentPose = pose;
            DefaultTableModel model
                    = (DefaultTableModel) this.jTableCurrentPose.getModel();
            final Point position = pose.getPosition();
            model.setValueAt(position.getX(), 0, 1);
            model.setValueAt(position.getY(), 1, 1);
            model.setValueAt(position.getZ(), 2, 1);
            final Quaternion orientation = pose.getOrientation();
            model.setValueAt(orientation.getW(), 3, 1);
            model.setValueAt(orientation.getX(), 4, 1);
            model.setValueAt(orientation.getY(), 5, 1);
            model.setValueAt(orientation.getZ(), 6, 1);
        });
    }

    private volatile List<String> currentJointStateNames = null;
    private double[] currentJointStatePositions = null;

    private void updateTableCurrentJointPositions(final List<String> jointStateNames, final double[] jointStatePositions) throws InvocationTargetException, InterruptedException {
        javax.swing.SwingUtilities.invokeLater(() -> {
            this.currentJointStateNames = jointStateNames;
            this.currentJointStatePositions = jointStatePositions;
            DefaultTableModel model
                    = (DefaultTableModel) this.jTableCurrentJointPositions.getModel();
            for (int i = 0; i < jointStatePositions.length && i < jointStateNames.size(); i++) {
                double positionI = jointStatePositions[i];
                final String nameI = jointStateNames.get(i);
                if (model.getRowCount() <= i) {
                    model.addRow(new Object[]{nameI, positionI});
                } else {
                    model.setValueAt(nameI, i, 0);
                    model.setValueAt(positionI, i, 1);
                }
            }
        });
    }

    private final MoveItControlNodeMain moveItControlNodMain;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCurrentJointPositions = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCurrentPose = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGoalJointPositions = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableGoalPose = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCopyCurrentToGoal = new javax.swing.JMenuItem();
        jMenuItemMoveToGoalPose = new javax.swing.JMenuItem();
        jMenuItemMoveToJointPositions = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Current"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Joint"));

        jTableCurrentJointPositions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"joint1",  new Double(0.001)},
                {"joint2",  new Double(0.002)},
                {"joint3",  new Double(0.003)},
                {"joint4",  new Double(0.004)},
                {"joint5",  new Double(0.005)},
                {"joint6",  new Double(0.006)},
                {"joint7",  new Double(0.007)},
                {"joint8",  new Double(0.008)}
            },
            new String [] {
                "Name", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCurrentJointPositions);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pose"));

        jTableCurrentPose.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"X",  new Double(0.001)},
                {"Y",  new Double(0.002)},
                {"Z",  new Double(0.003)},
                {"Q.W",  new Double(0.004)},
                {"Q.X",  new Double(0.005)},
                {"Q.Y",  new Double(0.006)},
                {"jQ.Z",  new Double(0.007)}
            },
            new String [] {
                "Name", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableCurrentPose);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Goal"));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Joint"));

        jTableGoalJointPositions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"joint1",  new Double(0.001)},
                {"joint2",  new Double(0.002)},
                {"joint3",  new Double(0.003)},
                {"joint4",  new Double(0.004)},
                {"joint5",  new Double(0.005)},
                {"joint6",  new Double(0.006)},
                {"joint7",  new Double(0.007)},
                {"joint8",  new Double(0.008)}
            },
            new String [] {
                "Name", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableGoalJointPositions);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Pose"));

        jTableGoalPose.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"X",  new Double(0.001)},
                {"Y",  new Double(0.002)},
                {"Z",  new Double(0.003)},
                {"Q.W",  new Double(0.004)},
                {"Q.X",  new Double(0.005)},
                {"Q.Y",  new Double(0.006)},
                {"jQ.Z",  new Double(0.007)}
            },
            new String [] {
                "Name", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableGoalPose);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Actions");

        jMenuItemCopyCurrentToGoal.setText("Copy Current To Goal");
        jMenuItemCopyCurrentToGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCopyCurrentToGoalActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCopyCurrentToGoal);

        jMenuItemMoveToGoalPose.setText("Move to Goal Pose");
        jMenuItemMoveToGoalPose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMoveToGoalPoseActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMoveToGoalPose);

        jMenuItemMoveToJointPositions.setText("Move to Joint Positions");
        jMenuItemMoveToJointPositions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMoveToJointPositionsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMoveToJointPositions);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCopyCurrentToGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCopyCurrentToGoalActionPerformed
        DefaultTableModel goalJointsTableModel = (DefaultTableModel) this.jTableGoalJointPositions.getModel();
        for (int i = 0; i < currentJointStatePositions.length && i < currentJointStateNames.size(); i++) {
            double positionI = currentJointStatePositions[i];
            String nameI = currentJointStateNames.get(i);
            if (goalJointsTableModel.getRowCount() <= i) {
                goalJointsTableModel.addRow(new Object[]{nameI, positionI});
            } else {
                goalJointsTableModel.setValueAt(nameI, i, 0);
                goalJointsTableModel.setValueAt(positionI, i, 1);
            }
        }
        DefaultTableModel goalPoseTableModel
                = (DefaultTableModel) this.jTableGoalPose.getModel();
        final Point position = currentPose.getPosition();
        goalPoseTableModel.setValueAt(position.getX(), 0, 1);
        goalPoseTableModel.setValueAt(position.getY(), 1, 1);
        goalPoseTableModel.setValueAt(position.getZ(), 2, 1);
        final Quaternion orientation = currentPose.getOrientation();
        goalPoseTableModel.setValueAt(orientation.getW(), 3, 1);
        goalPoseTableModel.setValueAt(orientation.getX(), 4, 1);
        goalPoseTableModel.setValueAt(orientation.getY(), 5, 1);
        goalPoseTableModel.setValueAt(orientation.getZ(), 6, 1);
    }//GEN-LAST:event_jMenuItemCopyCurrentToGoalActionPerformed

    private void jMenuItemMoveToGoalPoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMoveToGoalPoseActionPerformed
        double position_x =  (double) this.jTableGoalPose.getValueAt(0,1);
        double position_y =  (double) this.jTableGoalPose.getValueAt(1,1);
        double position_z =  (double) this.jTableGoalPose.getValueAt(2,1);
        double orientation_w =  (double) this.jTableGoalPose.getValueAt(3,1);
        double orientation_x =  (double) this.jTableGoalPose.getValueAt(4,1);
        double orientation_y =  (double) this.jTableGoalPose.getValueAt(5,1);
        double orientation_z =  (double) this.jTableGoalPose.getValueAt(6,1);
        if(null != moveItControlNodMain) {
            Pose pose = moveItControlNodMain.newPose();
            pose.getPosition().setX(position_x);
            pose.getPosition().setY(position_y);
            pose.getPosition().setZ(position_z);
            pose.getOrientation().setW(orientation_w);
            pose.getOrientation().setX(orientation_x);
            pose.getOrientation().setY(orientation_y);
            pose.getOrientation().setZ(orientation_z);
            moveItControlNodMain.gotoPose(pose);
        }
    }//GEN-LAST:event_jMenuItemMoveToGoalPoseActionPerformed

    private void jMenuItemMoveToJointPositionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMoveToJointPositionsActionPerformed
        double joint_positions[] = new double[jTableGoalJointPositions.getRowCount()];
        for (int i = 0; i < joint_positions.length; i++) {
            double joint_position_i = (double) jTableGoalJointPositions.getValueAt(i, 1);
            joint_positions[i] = joint_position_i;
        }
        if(null != moveItControlNodMain) {
            moveItControlNodMain.gotoJointPositions(joint_positions, currentJointStateNames);
        }
    }//GEN-LAST:event_jMenuItemMoveToJointPositionsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MoveItControlJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoveItControlJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoveItControlJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoveItControlJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoveItControlJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCopyCurrentToGoal;
    private javax.swing.JMenuItem jMenuItemMoveToGoalPose;
    private javax.swing.JMenuItem jMenuItemMoveToJointPositions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableCurrentJointPositions;
    private javax.swing.JTable jTableCurrentPose;
    private javax.swing.JTable jTableGoalJointPositions;
    private javax.swing.JTable jTableGoalPose;
    // End of variables declaration//GEN-END:variables

}
