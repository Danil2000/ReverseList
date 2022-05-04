import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ReversedListTest {
  Node argList;
  Node expectedList;
  ReversedList reversedList = new ReversedList();

  @Before
  public void createList() {
    argList = new Node(1);
    argList.next = new Node(2);
    argList.next.next = new Node(3);
    argList.next.next.next = new Node(5);
    expectedList = new Node(5);
    expectedList.next = new Node(3);
    expectedList.next.next = new Node(2);
    expectedList.next.next.next = new Node(1);
  }

  @Test
  public void testUsualList() {
    Node argHead = reversedList.reverseList(argList);
    Node expectHead = expectedList;
    while (argHead != null && expectHead != null) {
      if(argHead.data != expectHead.data) {
        assertTrue(false);
      }
      argHead = argHead.next;
      expectHead = expectHead.next;
    }
    assertTrue(true);
  }

  @Test
  public void testOneNodeList() {
    Node oneNode = new Node(2);
    Node expectedNode = new Node(2);
    assertEquals(reversedList.reverseList(oneNode).data, expectedNode.data);
  }
  @Test
  public void testEmptyList() {
    Node oneNode = null;
    Node expectedNode = null;
    assertEquals(reversedList.reverseList(oneNode).data, expectedNode.data);
  }
}