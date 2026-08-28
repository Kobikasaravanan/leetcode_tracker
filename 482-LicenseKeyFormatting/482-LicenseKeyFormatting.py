# Last updated: 28/8/2026, 2:48:57 pm
class Solution(object):
    def licenseKeyFormatting(self, s, k):
        clean=s.replace("-","").upper()
        result=[]
        first=len(clean)%k
        index=0
        if first!=0:
            result.append(clean[:first])
            index=first
        while index<len(clean):
            result.append(clean[index:index+k])
            index=index+k
        return "-".join(result)

        