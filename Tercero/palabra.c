#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[]) {
    if (argc != 3) {
        printf("Uso: %s <archivo> <palabra_clave>\n", argv[0]);
        return 1;
    }

    FILE *file = fopen(argv[1], "r");
    if (!file) {
        printf("No se pudo abrir el archivo.\n");
        return 1;
    }

    char palabra[100];
    int contador = 0;
    // Leer cada palabra del archivo
    while (fscanf(file, "%s", palabra) != EOF) {
        // Si la palabra leída es igual a la palabra clave
        if (strcmp(palabra, argv[2]) == 0) {
            contador++;
        }
    }

    fclose(file);
    printf("La palabra '%s' se repite %d veces en el texto.\n", argv[2], contador);
    return 0;
}
