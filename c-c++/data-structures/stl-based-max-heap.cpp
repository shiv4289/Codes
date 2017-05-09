/*
 * stl-based-heap.cpp
 *
 *  Created on: 09-May-2017
 *      Author: shivji
 *
 *  Reference: http://www.cplusplus.com/reference/algorithm/sort_heap/
 */

#include <iostream>
#include <algorithm>
#include <vector>

int main () {
  int myints[] = {10,20,30,5,15};
  std::vector<int> v(myints,myints+5);

  std::make_heap (v.begin(),v.end()); // O(3*n)
  std::cout << "initial max heap   : " << v.front() << '\n';

  /* Rearranges the elements in the heap range [first,last) in such a way
   * that the part considered a heap is shortened by one:
   */
  std::pop_heap (v.begin(),v.end()); v.pop_back(); // O(log n)
  std::cout << "max heap after pop : " << v.front() << '\n';

  /* Given a heap in the range [first,last-1),
   * this function extends the range considered a heap to [first,last)
   * by placing the value in (last-1) into its corresponding
   * location within it.
   */
  v.push_back(99); std::push_heap (v.begin(),v.end()); // O(log n)
  std::cout << "max heap after push: " << v.front() << '\n';

  // Sorts the elements in the heap range [first,last) into ascending order.
  /* Up to linearithmic in the distance between first and last:
   * Performs at most N*log(N) (where N is this distance) comparisons of
   * elements, and up to that many element swaps (or moves).
   *
   */
  std::sort_heap (v.begin(),v.end());

  std::cout << "final sorted range :";
  for (unsigned i=0; i<v.size(); i++)
    std::cout << ' ' << v[i];

  std::cout << '\n';

  return 0;
}
