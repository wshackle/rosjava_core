package org.apache.commons.httpclient;

/**
 * Signals that the response content was larger than anticipated. 
 * 
 * @author Ortwin Gluck
 * (sorry for changing name but special character broke my IDE.)
 */
public class HttpContentTooLargeException extends HttpException {
    private int maxlen;

    public HttpContentTooLargeException(String message, int maxlen) {
        super(message);
        this.maxlen = maxlen;
    }
    
    /**
     * @return the maximum anticipated content length in bytes.
     */
    public int getMaxLength() {
        return maxlen;
    }
}
