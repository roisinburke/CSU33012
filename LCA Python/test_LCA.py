import unittest
import LCA

class test_LCA(unittest.TestCase):

    def test_lca4_5(self):
        self.assertEqual(LCA.findLCA(LCA.root, 4, 5).key, 2)

    def test_lca6_2(self):
        self.assertEqual(LCA.findLCA(LCA.root, 6, 2).key, 1)

    def test_lca_none(self):
        self.assertEqual(LCA.findLCA(None, 4, 5), None)

    def test_lca1_5(self):
        self.assertEqual(LCA.findLCA(LCA.root, 1, 5).key, 1)

    def test_lca_same(self):
        self.assertEqual(LCA.findLCA(LCA.root, 1, 1).key, 1)

    def test_lca2_3(self):
        self.assertEqual(LCA.findLCA(LCA.root, 2, 3).key, 1)

    def test_lca6_7(self):
        self.assertEqual(LCA.findLCA(LCA.root, 6, 7).key, 3)

    def test_lca_fake(self):
        self.assertEqual(LCA.findLCA(LCA.root, 8, 8), None)


if __name__ == '__main__':
    unittest.main()
