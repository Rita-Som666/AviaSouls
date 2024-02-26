package ru.netology.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.AviaSouls;
import ru.netology.domain.Ticket;
import ru.netology.domain.TicketTimeComparator;

public class TicketTimeComparatorTest {

    @Test
    public void shouldReturnMinus1() {

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

        TicketTimeComparator compare = new TicketTimeComparator();

        int actual = compare.compare(ticket1, ticket2);
        int expected = -1;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldReturn1() {
        Ticket ticket1 = new Ticket(
                "Москва",
                "Париж",
                10_000,
                10,
                19
        );

        Ticket ticket2 = new Ticket(
                "Москва",
                "Париж",
                15_000,
                10,
                18
        );

        TicketTimeComparator compare = new TicketTimeComparator();

        int actual = compare.compare(ticket1, ticket2);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0() {
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
                18
        );

        TicketTimeComparator compare = new TicketTimeComparator();

        int actual = compare.compare(ticket1, ticket2);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}

