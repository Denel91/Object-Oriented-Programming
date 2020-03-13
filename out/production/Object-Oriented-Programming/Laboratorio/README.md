# Esame di Programmazione Orientata agli Oggetti 

> 30 luglio 2019: Comande di un ristorante

La pizzeria “Salerno” vuole usare un’app mobile per consentire ai suoi camerieri
e alla cassa di evitare di usare i bigliettini per registrare le comande (gli ordini
che un tavolo fa a un cameriere). 
La pizzeria dispone di N tavoli, una comanda riguarda un solo ordine.
*Esempio:* l’ordine fatto alle 12:45 di una pizza margherita e delle penne all’arrabbiata con un’insalata, mentre
il successivo ordine fatto mezz’ora dopo con un tiramisù e due caffè è una seconda comanda.
Ci possono essere 1 o più comande per tavolo. 
Le voci delle comande (articoli) riguardano le pietanze tratte da un menù di antipasti, primi piatti, secondi piatti, 
contorni, dolci e le bibite; 
il menù specifica il prezzo di un articolo e delle sue varianti (es: margherita senza mozzarella, margherita ma con stracchino).

Si necessita di un’API che consenta di:

    • creare una comanda con relativi articoli, da associare a un tavolo;
    
    • estrarre gli articoli ordinati non ancora consegnati, per tutti i tavoli
        
    • calcolare il conto di un tavolo
    
Mostrare con un esempio concreto come si invoca il metodo per creare una
comanda e analogamente per la creazione del menù.

