#event key == ord('문자')


import pygame, sys, time
from pygame.locals import *

FPS = 30
WINDOWWIDTH = 1000
WINDOWHEIGHT = 700
BUTTONWIDTH = 60
BUTTONHEIGHT = 15
BUTTONGAP = 10
BOXWIDTH = 970
BOXHEIGHT = 200
BOX_X = 15
BOX_Y = 485
BOXGAP = 15

SCENE_NUM = 1

#COLOR (R,G,B)
DARKGRAY = (40,40,40)

#TEXT
TEXT = pygame.image.load('시작화면.jpg')

#PEOPLE
PEOPLE = pygame.image.load('교수님1.jpg')
#BUTTON1
BUTTON1RECT_X = int(WINDOWWIDTH - BUTTONWIDTH*2 - BUTTONGAP*2 - BOXGAP)
BUTTON1RECT_Y = int(WINDOWHEIGHT - BOXGAP - BOXHEIGHT)
BUTTON1RECT = pygame.Rect(BUTTON1RECT_X,BUTTON1RECT_Y,BUTTONWIDTH,BUTTONHEIGHT)
#BUTTON2
BUTTON2RECT_X = int(WINDOWWIDTH - BUTTONWIDTH - BUTTONGAP - BOXGAP)
BUTTON2RECT_Y = int(WINDOWHEIGHT - BOXGAP - BOXHEIGHT)
BUTTON2RECT = pygame.Rect(BUTTON2RECT_X,BUTTON2RECT_Y,BUTTONWIDTH,BUTTONHEIGHT)
#BOX
BOXRECT = pygame.Rect(BOX_X,BOX_Y,BOXWIDTH,BOXHEIGHT)
#BACKGROUND 설정
BACKGROUND= pygame.image.load('세종대학교.jpg')
#졸림 사진
HAPPY = pygame.image.load('건강.jpg')
HAPPY = pygame.transform.scale(HAPPY, (400,400))
SAD = pygame.image.load('안건강.jpg')
SAD = pygame.transform.scale(SAD, (400,400))
GRADE = 4
HEALTH = 3
LIKE = 0




global FPSCLOCK, DISPLAYSURF, BASICFONT
 
pygame.init()
FPSCLOCK = pygame.time.Clock()
DISPLAYSURF = pygame.display.set_mode((WINDOWWIDTH,WINDOWHEIGHT)) #윈도우창 크기 설정
pygame.display.set_caption('학점 시뮬레이션') #윈도우창 이름 설정
BASICFONT = pygame.font.Font('freesansbold.ttf',25)
FINISH = False
while not FINISH: #game loop
           
    for event in pygame.event.get():
        GRADE_TEXT = BASICFONT.render("GRADE: %d" %(GRADE), True, (40,40,40))
        HEALTH_TEXT = BASICFONT.render("HEALTH: %d" %(HEALTH), True, (40,40,40))
        LIKE_TEXT = BASICFONT.render("LIKE: %d" %(LIKE),True,(40,40,40))
        if SCENE_NUM == 1 or SCENE_NUM==2 or SCENE_NUM==7 :
            DISPLAYSURF.fill((255,255,255))
            DISPLAYSURF.blit(BACKGROUND, (0,0))
            DISPLAYSURF.blit(TEXT,(BOXGAP+10,WINDOWHEIGHT-BOXGAP - BOXHEIGHT + 10))
            DISPLAYSURF.blit(GRADE_TEXT,(0,100))
            DISPLAYSURF.blit(HEALTH_TEXT,(0,130))
            DISPLAYSURF.blit(LIKE_TEXT,(0,160))
        else:
            DISPLAYSURF.fill((255,255,255))
            DISPLAYSURF.blit(BACKGROUND,(0,0))
            DISPLAYSURF.blit(TEXT,(BOXGAP+50,WINDOWHEIGHT-BOXGAP - BOXHEIGHT + 10))
            DISPLAYSURF.blit(PEOPLE,(BOXGAP+300,WINDOWHEIGHT - BOXGAP - BOXHEIGHT-500))
            DISPLAYSURF.blit(GRADE_TEXT,(0,100))
            DISPLAYSURF.blit(HEALTH_TEXT,(0,130))
            DISPLAYSURF.blit(LIKE_TEXT,(0,160))
        if event.type == pygame.KEYDOWN:
            if SCENE_NUM==1:
                if event.key == pygame.K_SPACE:
                    TEXT=pygame.image.load('장면1.jpg')
                    SCENE_NUM = SCENE_NUM + 1
                    continue
            if SCENE_NUM==2:
                if event.key == pygame.K_SPACE:
                    TEXT=pygame.image.load('장면2.jpg')
                    BACKGROUND=pygame.image.load('강의실.jpg')
                    PEOPLE = pygame.transform.scale(PEOPLE,(400,400))
                    SCENE_NUM = SCENE_NUM + 1
                    continue
            if SCENE_NUM==3:
                if event.key == pygame.K_SPACE:
                    TEXT = pygame.image.load('장면3.jpg')
                    SCENE_NUM = SCENE_NUM + 1
                    continue
            if SCENE_NUM==4:
                if event.key == pygame.K_SPACE:
                    TEXT=pygame.image.load('장면4.jpg')
                    SCENE_NUM = SCENE_NUM + 1
                    continue
            if SCENE_NUM==5:
                if event.key == ord('1'):
                    TEXT=pygame.image.load('장면4-1.jpg')
                    PEOPLE = pygame.image.load('교수님2.jpg')
                    PEOPLE = pygame.transform.scale(PEOPLE, (400,400))
                    GRADE = GRADE - 1
                    SCENE_NUM = SCENE_NUM + 1
                    continue
                elif event.key == ord('2'):
                    TEXT=pygame.image.load('장면4-2.jpg')
                    PEOPLE = pygame.image.load('건강.jpg')
                    PEOPLE = pygame.transform.scale(PEOPLE, (400,400))
                    HEALTH = HEALTH + 1
                    SCENE_NUM = SCENE_NUM + 1
                    continue
            if SCENE_NUM == 6:
                if event.key == pygame.K_SPACE:
                    TEXT=pygame.image.load('장면5.jpg')
                    BACKGROUND=pygame.image.load('세종대학교.jpg')
                    SCENE_NUM = SCENE_NUM + 1
                    continue
            if SCENE_NUM == 7:
                if event.key == pygame.K_SPACE:
                    TEXT=pygame.image.load('장면6.jpg')
                    PEOPLE = pygame.image.load 
                    SCENE_NUM = SCENE_NUM + 1
                    continue
            if SCENE_NUM == 8:
                if event.key == pygame.K_SPACE:
                    TEXT=pygame.image.load('장면7.jpg')
                    SCENE_NUM = SCENE_NUM + 1
                    continue
            if SCENE_NUM == 9:
                if event.key == pygame.K_SPACE:
                    TEXT=pygame.image.load
            
           
                
            



        if event.type == QUIT:
            pygame.quit()
            sys.exit()
    pygame.display.update()
     
        
