/*
 * stl-priority-queue-based-minheap.cpp
 *
 *  Created on: 09-May-2017
 *      Author: shivji
 *
 *  Refrence: http://www.geeksforgeeks.org/implement-min-heap-using-stl/
 */

#include <bits/stdc++.h>
using namespace std;

int main ()
{
    // Creates a min heap
    priority_queue <int, vector<int>, greater<int> > pq;
    pq.push(5);
    pq.push(1);
    pq.push(10);
    pq.push(30);
    pq.push(20);

    // One by one extract items from min heap
    while (pq.empty() == false)
    {
        cout << pq.top() << " ";
        pq.pop();
    }

    return 0;
}
