
# This is a generalized example, not specific to a test framework
import unittest
import LCA
class LCApyTest(unittest, LCA):

    def test_first(self):

        root = LCA(1) 
        root.left = LCA(2) 
        root.right = LCA(3) 
        root.left.left = LCA(4) 
        root.left.right = LCA(5) 
        root.right.left = LCA(6) 
        root.right.right = LCA(7) 

        # The exact assertion call depends on the framework as well
        self.assertEqual(LCA.findLCA(root, 4, 5).key, 2)
        self.assertEqual(LCA.findLCA(root, 4, 6).key, 1)
        self.assertEqual(LCA.findLCA(root, 3, 4).key, 1)
        self.assertEqual(LCA.findLCA(root, 2, 4).key, 2)
    # ...

