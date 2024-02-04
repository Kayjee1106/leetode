class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        a=1
        while True:
            if x<a*a:
                return a-1
            else:
                a+=1