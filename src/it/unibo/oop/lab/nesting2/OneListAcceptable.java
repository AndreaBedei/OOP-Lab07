package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	final List<T> vect;
	
	
	public OneListAcceptable(List<T> vect) {
		super();
		this.vect = vect;
	}


	@Override
	 public Acceptor<T> acceptor() {
        final Iterator<T> iterator = vect.iterator();
        return new Acceptor<T>() {

            /**
             * @param newElement
             *            the new element to be accepted
             */
            @Override
            public void accept(final T newElement) throws Acceptor.ElementNotAcceptedException {
                if (!iterator.hasNext() || !newElement.equals(iterator.next())) {
                    throw new Acceptor.ElementNotAcceptedException(newElement);
                }
            }

            @Override
            public void end() throws Acceptor.EndNotAcceptedException {
                if (iterator.hasNext()) {
                    throw new Acceptor.EndNotAcceptedException();
                }
            }
        };
    }

}
