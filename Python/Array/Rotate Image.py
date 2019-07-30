class Solution:
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        l=len(matrix)
        m=0
        while(m<l/2):
            k=m
            while(k<l-1-m):
                matrix[m][k], matrix[k][l-1-m], matrix[l-1-m][l-1-k], matrix[l-1-k][m] = matrix[l-1-k][m], matrix[m][k], matrix[k][l-1-m], matrix[l-1-m][l-1-k]
                k+=1  
            m+=1