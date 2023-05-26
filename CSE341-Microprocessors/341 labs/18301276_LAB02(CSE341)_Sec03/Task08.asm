;1)
;236DF*AF 

;mov ax,0236DFh 
;mov bl,0AFh
;mul bl
;error as operand 236DF exceeds 16 bits 

;2)
;8A32F4D5/C9A5

mov dx,08A32h
mov ax,0F4D5h
mov bx,0C9A5h
div bx

;3)
;CA92*BAF9

mov ax,0CA92h
mov bx,0BAF9h
mul bx

;4)
;C2A2*ABCD/BED

mov ax,0C2A2h
mov bx,0ABCDh
mul bx
mov bx,0BEDh
div bx
