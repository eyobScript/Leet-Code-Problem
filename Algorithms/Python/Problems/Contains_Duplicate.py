def containsDuplicate(nums):
    return len([n for n in set(nums)]) != len(nums)
resul = containsDuplicate([1,2,3,1])
print(resul)