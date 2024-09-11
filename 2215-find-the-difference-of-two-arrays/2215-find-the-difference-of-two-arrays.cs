using System;
using System.Collections.Generic;

public class Solution {
    public IList<IList<int>> FindDifference(int[] nums1, int[] nums2) {
        List<int> list1 = new List<int>();
        List<int> list2 = new List<int>();

        // HashSet for quick lookup
        HashSet<int> set1 = new HashSet<int>(nums1);
        HashSet<int> set2 = new HashSet<int>(nums2);

        // Add elements from nums1 that are not in nums2
        foreach (int num in nums1)
        {
            if (!set2.Contains(num) && !list1.Contains(num))
            {
                list1.Add(num);
            }
        }

        // Add elements from nums2 that are not in nums1
        foreach (int num in nums2)
        {
            if (!set1.Contains(num) && !list2.Contains(num))
            {
                list2.Add(num);
            }
        }

        // Create the result list of lists
        List<IList<int>> result = new List<IList<int>> { list1, list2 };

        return result;
    }
}
