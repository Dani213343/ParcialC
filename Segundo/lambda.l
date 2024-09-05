%{
#include <stdio.h>
int definicion_encontrada = 0;
int llamada_encontrada = 0;
%}

%%

square[ \t]*=[ \t]*lambda[ \t]*x[ \t]*:[ \t]*x[ \t]*\*\*[ \t]*2 {
    definicion_encontrada = 1;
}

print[ \t]*\([ \t]*square[ \t]*\([ \t]*3[ \t]*\)[ \t]*\) {
    llamada_encontrada = 1;
}

[ \t\n]+ ;  // Ignorar espacios y nuevas líneas
.|\n { /* Ignorar otros caracteres */ }

%%

int main(int argc, char **argv) {
    if (argc > 1) {
        FILE *file = fopen(argv[1], "r");
        if (!file) {
            perror("Error al abrir el archivo");
            return 1;
        }
        yyin = file;
        yylex();
        fclose(file);
        
        if (definicion_encontrada && llamada_encontrada) {
            printf("ACEPTA\n");
        } else {
            printf("NO ACEPTA\n");
        }
    } else {
        fprintf(stderr, "Uso: %s <archivo>\n", argv[0]);
        return 1;
    }
    return 0;
}
