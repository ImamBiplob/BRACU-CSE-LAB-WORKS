import socket
HEADER = 16
PORT = 5050
SERVER = socket.gethostbyname(socket.gethostname())
ADDR = (SERVER, PORT)
FORMAT = "utf-8"
DISCONNECT_MESSAGE = "End"
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(ADDR)
server.listen()
print("Server very good")
conn, addr = server.accept()
connected = True
while connected:
    msg_length = conn.recv(HEADER).decode(FORMAT)
    if msg_length:
        msg_length = int(msg_length)
        msg = conn.recv(msg_length).decode(FORMAT)
        if msg == DISCONNECT_MESSAGE:
            connected = False
            conn.send("Terminated By client".encode(FORMAT))

        else:
            if int(msg)<= 40:
                salary = int(msg)*200
                conn.send(f"Salary {salary}".encode(FORMAT))
            else:
                salary = 8000 + (int(msg)-40) * 300
                conn.send(f"Salary {salary}".encode(FORMAT))
conn.close()