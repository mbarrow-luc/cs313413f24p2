package cs271.lab.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPerformance {

  // run test and record running times for SIZE = 10, 100, 1000, 10000, ...
  // (choose in conjunction with REPS below up to an upper limit where the clock
  // running time is in the tens of seconds)
  // (optional) refactor to DRY
  // which of the two lists performs better as the size increases?
  private final int SIZE = 10000;

  // choose this value in such a way that you can observe an actual effect
  // for increasing problem sizes
  private final int REPS = 10000000;

  private List<Integer> arrayList;

  private List<Integer> linkedList;

  @Before
  public void setUp() throws Exception {
    arrayList = new ArrayList<Integer>(SIZE);
    linkedList = new LinkedList<Integer>();
    for (var i = 0; i < SIZE; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }
  }

  @After
  public void tearDown() throws Exception {
    arrayList = null;
    linkedList = null;
  }

  private void testListAddRemove(List<Integer> list) {
    for (var r = 0; r < REPS; r++) {
      list.add(0, 77);
      list.remove(0);
    }
  }

  private void testListAccess(List<Integer> list) {
    var sum = 0L;
    for (var r = 0; r < REPS; r++) {
      sum += list.get(r % SIZE);
    }
  }

  @Test
  public void testLinkedListAddRemove() {
    testListAddRemove(linkedList);
  }

  @Test
  public void testArrayListAddRemove() {
    testListAddRemove(arrayList);
  }

  @Test
  public void testLinkedListAccess() {
    testListAccess(linkedList);
  }

  @Test
  public void testArrayListAccess() {
    testListAccess(arrayList);
  }
}
