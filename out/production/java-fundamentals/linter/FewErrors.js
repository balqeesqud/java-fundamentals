function add1(a, b) {
  overflow = and(a, b);
  sum = xor(a, b);
  return { sum, overflow };
}

function zadd1(a, b, z) {
  var ones, zf;
  zf = or(or(and(a, b), and(b, z)), and(a, z));

  j = or(a, nor(b, z));
  k = or(b, nor(a, z));
  l = or(z, nor(a, b));

  console.log("jkl", j, k, l);

  ones = xor(j, xor(k, l));
  return { ones, zf };
}

console.log("zadd1 000", zadd1(0, 0, 0));
console.log("zadd1 001", zadd1(0, 0, 1));
console.log("zadd1 010", zadd1(0, 1, 0));
console.log("zadd1 011", zadd1(0, 1, 1));
console.log("zadd1 100", zadd1(1, 0, 0));
console.log("zadd1 101", zadd1(1, 0, 1));
console.log("zadd1 110", zadd1(1, 1, 0));
console.log("zadd1 111", zadd1(1, 1, 1));
