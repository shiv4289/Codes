/*
 * stl-priority-queue.cpp
 *
 *  Created on: 09-May-2017
 *      Author: shivji
 *
 *  Reference: http://en.cppreference.com/w/cpp/container/priority_queue
 */

/* A priority queue is a container adaptor that provides constant time lookup
 * of the largest (by default) element, at the expense of logarithmic insertion and extraction.
 *
 * Working with a priority_queue is similar to managing a heap in some random access container,
 * with the benefit of not being able to accidentally invalidate the heap.
 */
#include <functional>
#include <queue>
#include <vector>
#include <iostream>

template<typename T> void print_queue(T& q) {
    while(!q.empty()) {
        std::cout << q.top() << " ";
        q.pop();
    }
    std::cout << '\n';
}

int main() {
    std::priority_queue<int> pq;

    populate_PQ(pq);

    print_queue(pq);

    std::priority_queue<int, std::vector<int>, std::greater<int> > pq2;

    populate_PQ(ppq);

    print_queue(pq2);

    // Using lambda to compare elements.
    auto cmp = [](int left, int right) { return (left ^ 1) < (right ^ 1);};
    std::priority_queue<int, std::vector<int>, decltype(cmp)> pq3(cmp);

    populate_PQ(pq3);

    print_queue(q3);

}

template<typename T> void populate_PQ(T& pq){
	pq.push(1);
	pq.push(8);
	pq.push(5);
	pq.push(6);
	pq.push(3);
	pq.push(4);
	pq.push(0);
	pq.push(9);
	pq.push(7);
	pq.push(2);
}
