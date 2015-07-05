/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.exceptions;

/**
 *
 * @author Family
 */
public class QuestionsControlException extends Exception {

    public QuestionsControlException() {
    }

    public QuestionsControlException(String message) {
        super(message);
    }

    public QuestionsControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionsControlException(Throwable cause) {
        super(cause);
    }

    public QuestionsControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
