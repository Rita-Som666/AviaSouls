package ru.netology.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.AviaSouls;
import ru.netology.domain.Ticket;
import ru.netology.domain.TicketTimeComparator;

public class AviaSoulsTest {

    Ticket ticket1 = new Ticket(
            "Москва",
            "Париж",
            10_000,
            10,
            18
    );

    Ticket ticket2 = new Ticket(
            "Москва",
            "Париж",
            15_000,
            10,
            19
    );

    Ticket ticket3 = new Ticket(
            "Москва",
            "Париж",
            10_000,
            10,
            15
    );

    Ticket ticket4 = new Ticket(
            "Москва",
            "Париж",
            5_000,
            10,
            12
    );

    Ticket ticket5 = new Ticket(
            "Москва",
            "Париж",
            7_000,
            10,
            13
    );

    AviaSouls avia = new AviaSouls();


    @Test
    public void shouldSort() {

        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        Ticket[] expected = {ticket4, ticket5, ticket1, ticket3, ticket2};
        Ticket[] actual = avia.search("Москва", "Париж");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldSortByTime() {
        TicketTimeComparator timeComparator = new TicketTimeComparator();
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        Ticket[] expected = {ticket4, ticket5, ticket3, ticket1, ticket2};
        Ticket[] actual = avia.searchAndSortBy("Москва", "Париж", timeComparator);
        Assertions.assertArrayEquals(expected, actual);
    }
}
