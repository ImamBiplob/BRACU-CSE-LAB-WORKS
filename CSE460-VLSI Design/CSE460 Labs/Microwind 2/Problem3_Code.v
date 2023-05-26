module problem3_18301276(D, C, B, X, Y);
    input D, C, B;
    output X, Y;
    wire w1, w2, w3, w4, w5, w6;

    and(w1, D, C);
    or(w2, D, C);
    not(w3, w2);

    and(w5, B, w3);
    not(w4, B);

    and(w5, B, w3);
    and(w6, w2, w4);

    or(Y, w1, w3);
    or(X, w5, w6);
endmodule;