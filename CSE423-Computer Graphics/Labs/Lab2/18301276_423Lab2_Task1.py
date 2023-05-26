from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *


def findzone(x1, y1, x2, y2):
    dx = x2 - x1
    dy = y2 - y1
    if (dx >= 0 and dy >= 0):
        if (abs(dx) >= abs(dy)):
            return 0
        else:
            return 1
    elif (dx <= 0 and dy >= 0):
        if (abs(dx) >= abs(dy)):
            return 3
        else:
            return 2
    elif (dx <= 0 and dy <= 0):
        if (abs(dx) >= abs(dy)):
            return 4
        else:
            return 5
    else:
        if (abs(dx) >= abs(dy)):
            return 7
        else:
            return 6


def convertToZone0(x0, y0, zone):
    if (zone == 1):
        x = y0
        y = x0
    elif (zone == 2):
        x = y0
        y = -x0
    elif (zone == 3):
        x = -x0
        y = y0
    elif (zone == 4):
        x = -x0
        y = -y0
    elif (zone == 5):
        x = -y0
        y = -x0
    elif (zone == 6):
        x = -y0
        y = x0
    else:
        x = x0
        y = -y0

    return x, y


def toOriginalZone(X, Y, zone):
    glBegin(GL_POINTS)
    if (zone == 1):
        x = Y
        y = X
        glVertex2f(x, y)
    elif (zone == 2):
        x = -Y
        y = X
        glVertex2f(x, y)
    elif (zone == 3):
        x = -X
        y = Y
        glVertex2f(x, y)
    elif (zone == 4):
        x = -X
        y = -Y
        glVertex2f(x, y)
    elif (zone == 5):
        x = -Y
        y = -X
        glVertex2f(x, y)
    elif (zone == 6):
        x = Y
        y = -X
        glVertex2f(x, y)
    else:
        x = X
        y = -Y
        glVertex2f(x, y)

    glEnd()


def midPointLine(x1, y1, x2, y2):
    zone = findzone(x1, y1, x2, y2)
    if(zone!=0):
        x1, y1 = convertToZone0(x1, y1, zone)
        x2, y2 = convertToZone0(x2, y2, zone)
    dx = x2 - x1
    dy = y2 - y1
    d = 2 * dy - dx
    ne = 2 * dy - 2*dx
    e = 2 * dy

    x = x1
    y = y1

    while x <= x2:
        if(zone!=0):
            toOriginalZone(x, y, zone)
        else:
            glBegin(GL_POINTS)
            glVertex2f(x,y)
            glEnd()
        x += 1
        if (d > 0):
            y += 1
            d = d + ne
        else:
            d = d + e


def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(-100.0, 100.0, -100.0, 100.0, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()


def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(1.0, 0.0, 3.0)
    # call the draw methods here

    # my id =18301276, will draw 76
    midPointLine(-80, 50, -10, 50)
    midPointLine(-80,-50,-10,50)
    midPointLine(10,50,80,50)
    midPointLine(10,50,10,-50)
    midPointLine(10,0,80,0)
    midPointLine(80,0,80,-50)
    midPointLine(10,-50,80,-50)

    glutSwapBuffers()


glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(100, 100)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()

