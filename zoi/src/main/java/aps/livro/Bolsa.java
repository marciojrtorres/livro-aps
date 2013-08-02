package aps.livro;

import java.util.*;

public class Bolsa implements Iterable {

	private Object[] objetos;
	private int indice = 0;

	public Bolsa(int tamanho) {
		objetos = new Object[tamanho];
	}

	public void adiciona(Object obj) {
		objetos[indice++] = obj;
	}

	public Iterator iterator() {
		return new BolsaIterator();
	}

	private class BolsaIterator implements Iterator {

		private int p = 0;

		public boolean hasNext() {
			return objetos[p] != null;
		}

		public Object next() {
			return objetos[p++];
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

}