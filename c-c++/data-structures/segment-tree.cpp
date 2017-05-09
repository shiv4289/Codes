/*
 *
 *  Created on: 09-May-2017
 *      Author: shivji
 *
 *   Reference: http://codeforces.com/blog/entry/18051
 */
#include <stdio.h>

void build(int t[], int n) {  // build the tree
  for (int i = n - 1; i > 0; --i) t[i] = t[i<<1] + t[i<<1|1];
}

void modify(int t[], int n, int p, int value) {  // set value at position p
  for (t[p += n] = value; p > 1; p >>= 1) t[p>>1] = t[p] + t[p^1];
}

int query(int t[], int n, int l, int r) {  // sum on interval [l, r)
  int res = 0;
  for (l += n, r += n; l < r; l >>= 1, r >>= 1) {
    if (l&1) res += t[l++];
    if (r&1) res += t[--r];
  }
  return res;
}

//int main() {
//	const int N = 1e5;  // limit for array size
//	int n;  // array size
//	int t[2 * N];
//
//	scanf("%d", &n);
//	for (int i = 0; i < n; ++i) scanf("%d", t + n + i);
//
//	build(t, n);
//    printf("%d\n", query(t, n, 1, 3));
//
//	modify(t, n, 1, 10);
//    printf("%d\n", query(t, n, 1, 3));
//
//    return 0;
//}

