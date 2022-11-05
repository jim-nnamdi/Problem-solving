// code representation of a single ended queue
// which means that we can remove and insert
// only in one direction.

class QueueDs<B>(vararg items: B) {

    // change to mutable list since it is immutable by default
    private val elements = items.toMutableList()

    // add to queue
    fun addToQueue(element: B) = elements.add(element)

    // remove from queue
    fun removeFromQueue(element: B) =  elements.removeAt(elements.size -1)

    // see the last element in queue <peek>
    fun seeLastElement() = elements.last()

    // see the first element in queue
    fun seeFirstElement() = elements.first()

}