"""
217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

"""


def containsDuplicate(nums):
    return len([n for n in set(nums)]) != len(nums)


print(containsDuplicate([1,2,3,1]))