
public class LCAJavaTest {
    @Test
    public void testLCA(){
        LCA tree = new LCA();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        int expected = 2;
        assertEquals("LCA(4, 5) = ", expected, tree.findLCA(4, 5).data);
        expected = 1;
        assertEquals("LCA(4, 6) = " , expected, tree.findLCA(4, 6).data);
        expected = 1;
        assertEquals("LCA(3, 4) = ", expected, tree.findLCA(3, 4).data);
        expected = 2;
        assertEquals("LCA(2, 4) = ", expected, tree.findLCA(2, 4).data);

        tree = new LCA();
        tree.root = new TreeNode(1);
        expected = 1;
        assertEquals(expected, tree.findLCA(1, 3).data);
        tree.root.left = new TreeNode(2);
        assertEquals(expected, tree.findLCA(1, 2).data);

    }
    @Test
    public void testNull(){
        LCA tree = new LCA();
        assertEquals(null, tree.findLCA(1, 2));
    }

    @Test
    public void sameNodeTest() {
        LCA sameNode = new LCA();
        sameNode.root = new TreeNode(3);
        sameNode.root.left = new TreeNode(3);
        sameNode.root.right = new TreeNode(3);
        int expected = 3;
        assertEquals("LCA of 3 and 3: ",expected,sameNode.findLCA(3, 3).data);
    }
}

