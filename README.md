# Jackson XML Parsing

jackson에서 xml 처리를 할때 배열 형태의 데이터들이 제대로 처리되지 않았음.(물론 내가 잘 몰라서)  

data.xml에 있는 items와 같이 배열 형태의 데이터가 마지막 item만 파싱되는 문제!

그래서 해결책으로 찾은게 xml에 있는 모든 노드들에 대해서 클래스를 만들고 각각 다 받아올 수 있도록 처리

이 문제에 대해서 더 깔끔한 해결책을 아시는분은 알려주시면 정말! 감사하겠습니다!


[참고 사이트](https://www.programcreek.com/java-api-examples/?code=srecon/OracleToElasticSearch/OracleToElasticSearch-master/qrcn/src/test/java/com/blu/db/XMLBindingTest.java#)