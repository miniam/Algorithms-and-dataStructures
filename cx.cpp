import re 
  
def longestSubstring(s): 
      
    longest_letterSeq = '' 
    i = 0
    while(i<len(s)): 
          
        curr_letterSeq = '' 
        curr_digitSeq = '' 
          
        # For letter substring  
        while(i<len(s) and s[i].isalpha()): 
            curr_letterSeq += s[i] 
            i+= 1
  
        # Case handling if the character  
        # is neither letter nor digit     
        if(i< len(s) and not(s[i].isalpha())) : 
            i+= 1
          
        if(len(curr_letterSeq) > len(longest_letterSeq) ): 
            longest_letterSeq = curr_letterSeq 
          
    return longest_letterSeq

str = 'here123were23we'
print(longestSubstring(str)) 
