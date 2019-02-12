/*Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You may not modify the values in the list's nodes, only nodes itself may be changed.*/




class modifyTheList {
    public void reorderList(ListNode head) {
        
        if(head != null && head.next != null) {
            // Step 1 : Find the middle of the LinkedList and break it in two parts.
            ListNode slow=head, fast=head, prev=null;
            while(fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = null;
            
            // Step 2 : Reverse the second part of the List.
            ListNode holder = null;
            while(slow != null) {
                ListNode temp = slow.next;
                slow.next = holder;
                holder = slow;
                slow = temp;
            }
            
            // Step 3 : Take two pointers (left and right) to point the next pointer 
            //          to the alternate list elements until any one of 
            //          the lists are empty (temp and holder).
            ListNode temp = head.next;
            int left=0, right=0;
            while(temp != null && holder != null) {
                if(left > right) {
                    head.next = temp;
                    temp = temp.next;
                    right++;
                } else {
                    head.next = holder;
                    holder = holder.next;
                    left++;
                }
                head = head.next;
            }
            if(temp != null) {
                head.next = temp;
            }
            if(holder != null) {
                head.next = holder;
            }
        }
    }
}
