import static org.junit.Assert.*;
import org.junit.Test;

public class LCAJavaTest {
    @Test
    public void testBST(){
        LCA tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        int expected = 2;
        assertEquals("LCA(4, 5) = ", expected, tree.findLCA(4, 5));
        expected = 1;
        assertEquals("LCA(4, 6) = " , expected, tree.findLCA(4, 6));
        expected = 1;
        assertEquals("LCA(3, 4) = ", expected, tree.findLCA(3, 4));
        expected = 2;
        assertEquals("LCA(2, 4) = ", expected, tree.findLCA(2, 4));

        tree = new LCA();
        tree.root = new Node(1);
        expected = -1;
        assertEquals(expected, tree.findLCA(1, 3));
        tree.root.left = new Node(2);
        expected = 1;
        assertEquals(expected, tree.findLCA(1, 2));

    }
    @Test
    public void testNull(){
        LCA tree = new LCA();
        int expected = -1;
        assertEquals(expected, tree.findLCA(1, 2));
    }
    @Test
    public void testOddTree () {
        LCA oddTree = new LCA();
        oddTree.root = new Node(1);
        oddTree.root.right = new Node(2);
        oddTree.root.right.right = new Node(3);
        oddTree.root.right.right.right = new Node(4);
        oddTree.root.right.right.right.right = new Node(5);

        int expected = 1;
        assertEquals("Odd tree with five nodes: LCA(1, 2) = ", expected, oddTree.findLCA(1, 2));
        expected = 3;
        assertEquals("Odd tree with five nodes: LCA(3, 5) = ", expected, oddTree.findLCA(3, 5));
        expected = 2;
        assertEquals("Odd tree with five nodes: LCA(2, 4) = ", expected, oddTree.findLCA(2, 4));

    }
    @Test
    public void testEvenTree () {
        LCA evenTree = new LCA();
        evenTree.root = new Node(1);
        evenTree.root.right = new Node(2);
        evenTree.root.right.right = new Node(3);
        evenTree.root.right.right.right = new Node(4);
        int expected = 3;
        assertEquals("Even tree with four nodes:  LCA(3, 4) = ", expected, evenTree.findLCA(3,4));
        expected = 1;
        assertEquals("Even tree with four nodes:  LCA(2, 1) = ", expected, evenTree.findLCA(2, 1));
    }
    @Test
    public void sameNodeTest() {
        LCA sameNode = new LCA();
        sameNode.root = new Node(3);
        sameNode.root.left = new Node(3);
        sameNode.root.right = new Node(3);
        int expected = 3;
        assertEquals("LCA of 3 and 3: ",expected,sameNode.findLCA(3, 3));
    }
}