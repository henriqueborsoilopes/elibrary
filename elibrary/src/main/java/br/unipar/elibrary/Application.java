package br.unipar.elibrary;

import br.unipar.elibrary.entities.*;
import br.unipar.elibrary.entities.enums.PaymentStatus;
import br.unipar.elibrary.entities.exceptions.IllegalDataException;
import java.math.BigDecimal;
import java.util.Date;

public class Application {

    public static void main(String[] args) {

        try {
            CountryEntity country = new CountryEntity(1L, "Brasil");

            StateEntity state = new StateEntity(1L, "Paraná", country);

            country.addStates(state);

            CityEntity city = new CityEntity(1L, "Toledo", state);

            state.addCities(city);

            AddressEntity address = new AddressEntity(1L, "Rua Senho dos Passos", city);
            AddressDistrictEntity district = new AddressDistrictEntity(1L, "Jardim Pancera", address);
            AddressZipCodeEntity zipcode = new AddressZipCodeEntity(1L, "85902196", address);

            address.addDistrict(district);
            address.addZipCodes(zipcode);

            UserEntity user = new UserEntity(1L, "Henrique Borsoi Lopes");

            AddressDetailEntity cliAddress = new AddressDetailEntity(1L, 410, "Casa", user, address);

            user.addAddressDetails(cliAddress);

            AuthorEntity author = new AuthorEntity(2L, "Anderson");
            
            PublisherEntity publisher = new PublisherEntity("00.394.460/0058-87", 3L, "A Folha");

            StockEntity stock = new StockEntity(1L, "Livros");

            GenreEntity genre = new GenreEntity(1L, "Informática");

            BookEntity book1 = new BookEntity(250, new Date().toInstant(), publisher, 1L, "Programação Orientada a Objetos", 5, new BigDecimal(150.00), new BigDecimal(0.0), false, stock);
            BookEntity book2 = new BookEntity(250, new Date().toInstant(), publisher, 2L, "Banco de Dados", 5, new BigDecimal(150.00), new BigDecimal(0.0), false, stock);
            BookEntity book3 = new BookEntity(250, new Date().toInstant(), publisher, 3L, "Gestão de Projetos e Equipes", 5, new BigDecimal(150.00), new BigDecimal(0.0), false, stock);

            stock.addProducts(book1);
            stock.addProducts(book2);
            stock.addProducts(book3);
            
            AuthorBookEntity authorBook1 = new AuthorBookEntity((AuthorEntity) author, book1);
            AuthorBookEntity authorBook2 = new AuthorBookEntity((AuthorEntity) author, book2);
            AuthorBookEntity authorBook3 = new AuthorBookEntity((AuthorEntity) author, book3);

            author.addAuthorBook(authorBook1);
            author.addAuthorBook(authorBook2);
            author.addAuthorBook(authorBook3);
            
            book1.addAuthors(authorBook1);
            book2.addAuthors(authorBook2);
            book3.addAuthors(authorBook3);
            
            GenreBookEntity genreBook1 = new GenreBookEntity(genre, (BookEntity) book1);
            GenreBookEntity genreBook2 = new GenreBookEntity(genre, (BookEntity) book2);
            GenreBookEntity genreBook3 = new GenreBookEntity(genre, (BookEntity) book3);

            genre.addGenreBooks(genreBook1);
            genre.addGenreBooks(genreBook2);
            genre.addGenreBooks(genreBook3);
            
            book1.addGenreBooks(genreBook1);
            book2.addGenreBooks(genreBook2);
            book3.addGenreBooks(genreBook3);
            
            OrderEntity order = new OrderEntity(1L, new Date().toInstant(), new BigDecimal(20), user);

            OrderItemEntity item1 = new OrderItemEntity(order, book1, new BigDecimal(150.0), 5, new BigDecimal(0.0), false);
            OrderItemEntity item2 = new OrderItemEntity(order, book2, new BigDecimal(150.0), 1, new BigDecimal(0.0), false);
            OrderItemEntity item3 = new OrderItemEntity(order, book3, new BigDecimal(150.0), 1, new BigDecimal(0.0), false);

            System.out.println(stock.toString());
            System.out.println();
            System.out.println();
            
            book1.decreaseAmount(item1.getAmount());
            book2.decreaseAmount(item2.getAmount());
            book3.decreaseAmount(item3.getAmount());

            String input = "3";
  
            BigDecimal divisor = new BigDecimal(input);
            
            order.addOrderItens(item1);
            order.addOrderItens(item2);
            order.addOrderItens(item3);
            
            CardFlagEntity mastercard = new CardFlagEntity(1L, "Mastercard");
        
            PaymentEntity pay2 = new CreditCardPaymentEntity(1, mastercard, 2L, new Date().toInstant(), order.getSubTotalPrice().divide(divisor, 3), PaymentStatus.SETTLED, order);
            PaymentEntity pay1 = new CashPaymentEntity(new BigDecimal(0), 1L, new Date().toInstant(), order.getSubTotalPrice().divide(divisor, 3), PaymentStatus.SETTLED, order);
            PaymentEntity pay3 = new DebitCardPaymentEntity(mastercard, 3L, new Date().toInstant(), order.getSubTotalPrice().divide(divisor,3), PaymentStatus.SETTLED, order);
                        
            order.addPayments(pay1);
            order.addPayments(pay2);
            order.addPayments(pay3);
            
            System.out.println(order.toString());
            System.out.println();
            System.out.println();
            System.out.println(stock.toString());
        } catch (IllegalDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
