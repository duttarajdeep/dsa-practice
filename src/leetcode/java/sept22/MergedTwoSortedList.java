package leetcode.java.sept22;//package leetcode.java.sept21;
//
//public class MergedTwoSortedLL {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy = new ListNode(0);
//        ListNode temp = dummy;
//        while (list1 != null && list2 != null) {
//            if (list1.data > list2.data) {
//                temp.next = list2;
//                list2 = list2.next;
//            } else {
//                temp.next = list1;
//                list1 = list1.next;
//            }
//            temp = temp.next;
//        }
//
//        // if list 1 is exhausted
//        if (list1 == null) {
//            temp.next = list2;
//        } else {
//            temp.next = list1;
//        }
//        return dummy.next;
//    }
//
//}
