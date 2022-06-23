package Day13.adam.Maps;

public class HashCollisionResolve {
  /**
   * Two types of resolution:
   * 	1. Separate chaining (open hashing)
   * 	2. Open addressing (closed hashing)
   *
   * Separate chaining
   * In this technique, a linked list is created from the slot in which collision has occurred,
   * after which the new key is inserted into the linked list. This linked list of slots looks like a chain,
   * so it is called separate chaining. It is used more when we do not know how many keys to insert or delete.
   *
   * Time complexity
   * Its worst-case complexity for searching is o(n).
   * Its worst-case complexity for deletion is o(n).
   * Advantages of separate chaining
   * It is easy to implement.
   * The hash table never fills full, so we can add more elements to the chain.
   * It is less sensitive to the function of the hashing.
   * Disadvantages of separate chaining
   * In this, cache performance of chaining is not good.
   * The memory wastage is too much in this method.
   * It requires more space for element links.
   *
   * Open addressing
   * 	1. Linear probing
   * 	2. Quadratic probing
   * 	3. Double hashing
   *
   * Linear probing
   * In this, when the collision occurs, we perform a linear probe for the next slot, and this probing is performed
   * until an empty slot is found.
   * In linear probing, the worst time to search for an element is O(table size).
   * The linear probing gives the best performance of the cache but its problem is clustering.
   * The main advantage of this technique is that it can be easily calculated.
   *
   * Quadratic probing
   * In this, when the collision occurs, we probe for i2th slot in ith iteration, and this probing is performed until an empty slot is found.
   * The cache performance in quadratic probing is lower than the linear probing.
   * Quadratic probing also reduces the problem of clustering.
   *
   * Double hashing
   * In this, you use another hash function, and probe for (i * hash 2(x)) in the ith iteration.
   * It takes longer to determine two hash functions. The double probing gives the very poor the cache performance,
   * but there has no clustering problem in it.
   *
   * Common Overflow Table
   * Put all collision data into the overflow table
   */
}
