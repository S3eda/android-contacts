package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffCallback <E>{
    public boolean theSameAs(E element);
    public boolean equals(Object o);
}
