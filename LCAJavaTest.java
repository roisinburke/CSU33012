import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BSTTest {
    @Test
    public void firstTest(){
        BST tree = new BST();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        int expected = 2;
        Assert.assertEquals("LCA(4, 5) = ", expected, tree.findLCA(4, 5).data);
        expected = 1;
        Assert.assertEquals("LCA(4, 6) = " , expected, tree.findLCA(4, 6).data);
        expected = 1;
        Assert.assertEquals("LCA(3, 4) = ", expected, tree.findLCA(3, 4).data);
        expected = 2;
        Assert.assertEquals("LCA(2, 4) = ", expected, tree.findLCA(2, 4).data);

        tree = new BST();
        tree.root = new Node(1);
        Assert.assertEquals(1, tree.findLCA(1, 3).data);
    }
    @Test
    public void testNull(){
        BST tree = new BST();
        Assert.assertEquals(null, tree.findLCA(1, 2));
    }
}