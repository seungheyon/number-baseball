숫자야구
========

#### 입력을 받아 숫자야구를 실행하는 프로젝트 입니다. 확장성을 유의하여 필수요구사항 구현 뒤 추가기능을 구현하는 방식으로 진행했습니다.

기능 요구사항
-------------

### 필수 요구사항
* 1 ~ 9 사이의 서로 다른 3 자리 수를 입력받습니다.
* 정답은 1 ~ 9 사이의 서로 다른 임의의 수가 됩니다.
* 같은 자리에 숫자가 같을 경우 **스트라이크**, 자리가 다르고 숫자만 같은 경우 **볼** 입니다.
* 올바르지 않은 입력에 대해서는 오류 문구를 출력합니다.

### 추가 기능
1. 프로그램 시작 시 안내 문구를 출력하고, 숫자를 입력받습니다. 1번이면 숫자야구를 실행합니다.
2. 정답이 되는 숫자를 0 ~ 9까지로 변경하고, 맨 앞자리에 0이 오는것은 불가능합니다.
3. 시작 안내에서 2번을 입력할 경우 이미 완료한 게임들에 대해 시도 횟수를 출력합니다.
4. 시작 안내에서 3번을 입력할 경우 게임 기록을 초기화하고 프로그램을 종료합니다.



프로젝트 구조
-------------

#### 프로젝트의 패키지 구조는 다음과 같습니다.

![image](https://github.com/seungheyon/number-baseball/assets/71931476/e9fe20c4-f497-4453-ac12-3bc7d5afb537)

#### 크게 Controller 계층, Logic 계층으로 나누어서 구현했습니다. Controller 계층은 최초 사용자 입력을 받고, 입력을 검증하며 처리하는 책임만을 가지고 있습니다. Logic 계층은 입력에 따라 숫자야구 게임을 진행하고 게임 로그를 기록하는 책임을 가집니다. 게임 기록을 저장하고 관리하며 출력하는 일은 GameRecord 클래스를 따로 작성해 Logic, Controller 와 같은 계층에 위치시켰습니다. 
#### 계층 간의 관계를 그림으로 나타내면 다음과 같습니다.

![image](https://github.com/seungheyon/number-baseball/assets/71931476/e190f68d-4ae5-4d96-968a-85a7d409ca73)

#### Controller 는 GamePlaymanagement 를 의존하고, GamePlaymanagement 는 NumberProcessor 를 의존합니다. NumberProcessor 는 GameRecord 를 통해 게임 로그를 기록하고, Controller 는 필요할 경우 기록된 데이터를 출력합니다.


실행 화면
---------
#### 어플리케이션을 시작하면 아래와 같이 안내 문구가 출력되고, 메뉴가 표시됩니다.
#### 1번을 입력하면 숫자야구가 시작됩니다.

![image](https://github.com/seungheyon/number-baseball/assets/71931476/bd6dae8f-4c63-4bef-b6a8-11699eafcf78)

#### 게임을 완료할 때까지 루프를 돌면서 정답 여부를 확인하고, 

![image](https://github.com/seungheyon/number-baseball/assets/71931476/6e704ee9-5d3f-4a87-a0fd-5c7c34698598)

#### 정답을 맞출 경우 숫자야구를 종료하며 다시 안내 화면으로 돌아옵니다.

![image](https://github.com/seungheyon/number-baseball/assets/71931476/52305a80-a947-4306-9018-3eb98ac6c3fc)


#### 잘못된 입력에 대해서는 오류 문구를 출력하고 다시 입력받도록 합니다.

![image](https://github.com/seungheyon/number-baseball/assets/71931476/6187be5b-c7e7-4d08-a414-405fbe2206be)


