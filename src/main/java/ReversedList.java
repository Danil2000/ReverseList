public class ReversedList {

  public Node reverseList(Node head) {
    if(head == null) {
      return null;
    }
    Node previous = null;
    Node current = head;
    while (current != null) {
      Node next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }
}
