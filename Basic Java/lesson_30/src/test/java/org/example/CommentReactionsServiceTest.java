//commentReactionsServiceTest.java

package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CommentReactionsServiceTest {

    @org.junit.jupiter.api.Test
    void getReactionsForPositive() {
        CommentReactionsService service = new CommentReactionsService();
        int result = service.getReactions("It is excellent car. I so happy for drive it. Good experience.");
        assertEquals(2, result);
    }
    @org.junit.jupiter.api.Test
    void getReactionsForNegative() {
        CommentReactionsService service = new CommentReactionsService();
        int result = service.getReactions("It is terrible TV. So awfully screen and badly noise");
        assertEquals(-3, result);
    }

}

    