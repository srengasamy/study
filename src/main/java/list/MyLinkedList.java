package list;

public class MyLinkedList {
  private ListNode head = new ListNode(-1);

  public MyLinkedList() {

  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index) {
    ListNode temp = head.next;
    int count = 0;
    while (temp != null) {
      if (count == index) {
        return temp.val;
      }
      temp = temp.next;
      count++;
    }
    return -1;
  }

  /**
   * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {
    ListNode next = head.next;
    head.next = new ListNode(val);
    head.next.next = next;
  }

  /**
   * Append a node of value val to the last element of the linked list.
   */
  public void addAtTail(int val) {
    ListNode temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = new ListNode(val);
  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val) {
    ListNode temp = head.next;
    ListNode last = head;
    int count = 0;
    while (temp != null) {
      if (count == index) {
        ListNode next = last.next;
        last.next = new ListNode(val);
        last.next.next = next;
        return;
      }
      last = temp;
      temp = temp.next;
      count++;
    }
    if (count == index) {
      last.next = new ListNode(val);
    }
  }

  /**
   * Delete the index-th node in the linked list, if the index is valid.
   */
  public void deleteAtIndex(int index) {
    ListNode temp = head.next;
    ListNode last = head;
    int count = 0;
    while (temp != null) {
      if (count == index) {
        last.next = temp.next;
        return;
      }
      last = temp;
      temp = temp.next;
      count++;
    }
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.addAtIndex(-1, 0);
    System.out.println(list.get(0));
  }
}
