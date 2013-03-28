/*
With the advent of high speed graphics workstations, 
CAD (computer-aided design) and other areas (CAM, VLSI design) have made increasingly effective use of computers.
One of the problems with drawing images is the elimination of hidden lines -- lines obscured by other parts of a drawing.
*/

function uva105(bds) {
  var data = [], sky = [];
  var i, j, k, l, bd, maxR = 0;
  for (i = 0; i < 10001; i++) {
    data.push(0);
  }
  for (j = 0; j < bds.length; j++) {
    bd = bds[j];
    for (k = bd[0]; k < bd[2]; k++) {
      data[k] = (bd[1] > data[k]) ? bd[1] : data[k];
    }
    maxR = (bd[2] > maxR) ? bd[2] : maxR;
  }
  for (l = 1; l <= maxR; l++) {
    if (data[l - 1] !== data[l]) {
      sky.push(l);
      sky.push(data[l]);
    }
  }
  return sky;
}

var bds = [
  [1, 11, 5],
  [2, 6, 7],
  [3, 13, 9],
  [12, 7, 16],
  [14, 3, 25],
  [19, 18, 22],
  [23, 13, 29],
  [24, 4, 28]
];

uva105(bds);
