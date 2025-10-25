# Comparação de Algoritmos de Ordenação

Este repositório contém a implementação de seis algoritmos de ordenação em Java:
- Bubble Sort (com flag)
- Selection Sort
- Cocktail Sort
- Comb Sort
- Gnome Sort
- Bucket Sort

Os algoritmos foram testados com os seguintes vetores:
1. Aleatório
2. Quase ordenado
3. Decrescente

Foram contabilizadas **iterações** (quantidade de comparações), **trocas** de elementos, e tempo de execução.

## Vetor 1 (aleatório)

| Algoritmo      | Iterações | Trocas | Tempo (ns) | Ranking Iterações | Ranking Trocas | Ranking Tempo |
| -------------- | --------- | ------ | ---------- | ----------------- | -------------- | ------------- |
| Bubble Sort    | 180       | 78     | 6800       | 5                 | 4              | 5             |
| Selection Sort | 190       | 18     | 5400       | 6                 | 1              | 4             |
| Cocktail Sort  | 154       | 78     | 6200       | 4                 | 4              | 5             |
| Comb Sort      | 129       | 22     | 4900       | 1                 | 2              | 3             |
| Gnome Sort     | 175       | 78     | 5900       | 3                 | 4              | 4             |
| Bucket Sort    | 84        | 42     | 14300      | 2                 | 3              | 6             |

## Vetor 2 (quase ordenado)

| Algoritmo      | Iterações | Trocas | Tempo (ns) | Ranking Iterações | Ranking Trocas | Ranking Tempo |
| -------------- | --------- | ------ | ---------- | ----------------- | -------------- | ------------- |
| Bubble Sort    | 19        | 0      | 900        | 3                 | 1              | 3             |
| Selection Sort | 190       | 0      | 4100       | 6                 | 1              | 6             |
| Cocktail Sort  | 19        | 0      | 1000       | 3                 | 1              | 4             |
| Comb Sort      | 110       | 0      | 2500       | 5                 | 1              | 5             |
| Gnome Sort     | 19        | 0      | 1000       | 3                 | 1              | 4             |
| Bucket Sort    | 18        | 0      | 4700       | 1                 | 1              | 6             |

## Vetor 3 (decrescente)

| Algoritmo      | Iterações | Trocas | Tempo (ns) | Ranking Iterações | Ranking Trocas | Ranking Tempo |
| -------------- | --------- | ------ | ---------- | ----------------- | -------------- | ------------- |
| Bubble Sort    | 190       | 190    | 8400       | 3                 | 4              | 5             |
| Selection Sort | 190       | 10     | 4900       | 3                 | 1              | 3             |
| Cocktail Sort  | 190       | 190    | 7600       | 3                 | 4              | 4             |
| Comb Sort      | 129       | 18     | 3400       | 1                 | 2              | 1             |
| Gnome Sort     | 399       | 190    | 12200      | 6                 | 4              | 6             |
| Bucket Sort    | 63        | 63     | 6000       | 2                 | 3              | 2             |
