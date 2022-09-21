package com.github.dkicinski.jlox;

import java.text.MessageFormat;

public class Token {
    final TokenType _type;
    final String _lexeme;
    final Object _literal;
    final int _line;

    Token(TokenType type, String lexeme, Object literal, int line) {
        _type = type;
        _lexeme = lexeme;
        _literal = literal;
        _line = line;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} {1} {2}", _type, _lexeme, _literal);
    }
}
