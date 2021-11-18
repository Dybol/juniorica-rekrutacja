# Zadanie rekrutacyjne do Junioriki
----
## Endpointy:
### 1. Dodawanie kredytu </br>
Należy wysłać zapytanie POST pod adres
```
http://localhost:9000/credit
```
Zawierając informacje o nazwie kredytu, produkcie i kliencie.
</br>
#### Przykład: 
```
{
    "credit": {
        "creditName": "Biznesowy"
    },
    "customer": {
        "firstName": "Mikołaj",
        "pesel": "12345678901",
        "surname": "Kowalski"
    },
    "product": {
        "productName": "Testowy",
        "value": 13000
    }
}
```

### 2. Zwracanie kredytów
Należy wysłać zapytanie GET pod adres
```
http://localhost:9000/credits
```
W odpowiedzi zostanie wyświetlona lista wszystkich kredytów. 

-----
- W moim projekcie zawarte zostały trzy niezależne aplikacje, które działają pod portami 9000, 9001 i 9002. Połączyłem je korzystając z RestTemplate'u. </br>
- <i> Product </i> jak i <i> Customer </i> wystawiają endpointy zarówno do pobierania wszystkich, jak i do wstawiania nowych obiektów, z których korzysta <i> CreditService </i> </br>
- Obsługę bazy danych danych zrealizowałem w MySQL'u.

----
### Problemy, z którymi się mierzyłem
Postanowiłem dodać nieskończoną, jednak działającą wersję aplikacji. Nie użyłem tutaj Dockera do stworzenia kontenerów, ponieważ połączenie go odpowiednio z bazą danych 
przerosło moje możliwości. O ile uruchomienie jednego kontenera korzystającego z bazy danych, np. dla produktu, nie stanowiło problemu, o tyle uruchomienie pozostałych kontenerów
korzystających jedynie z jednego bazodanowego kontenera nie udało mi się. 
</br>


