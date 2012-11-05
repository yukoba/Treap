import org.junit.Test;

import static org.junit.Assert.*;

public class TreapTest {
    @Test
    public void test() {
        Treap<Byte> treap = new Treap<Byte>();
        treap.add((byte) 1);
//        System.out.println("[test] treap = " + treap);
        treap.add((byte) 2);
//        System.out.println("[test] treap = " + treap);
        treap.add((byte) 3);
//        System.out.println("[test] treap = " + treap);
        treap.add((byte) 4);
//        System.out.println("[test] treap = " + treap);

        for (int i = 1; i <= 4; i++) {
            assertTrue(treap.contains((byte) i));
        }
        assertFalse(treap.contains((byte) 5));

        assertEquals((byte) 1, (byte) treap.first());

        treap.remove((byte) 3);
        assertTrue(treap.contains((byte)1));
        assertTrue(treap.contains((byte)2));
        assertFalse(treap.contains((byte)3));
        assertTrue(treap.contains((byte)4));

        treap.remove((byte) 2);
        assertTrue(treap.contains((byte) 1));
        assertFalse(treap.contains((byte) 2));
        assertFalse(treap.contains((byte) 3));
        assertTrue(treap.contains((byte)4));
    }
}
