package ufma.ecp.diego.jlox;

import java.util.List;

import static ufma.ecp.diego.jlox.TokenType.*;

class Parser {
  private final List<Token> tokens;
  private int current = 0;

  Parser(List<Token> tokens) {
    this.tokens = tokens;
  }
}