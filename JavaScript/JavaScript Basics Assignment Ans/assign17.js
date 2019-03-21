function createCourse(title,duration,students){
    var course=new Object;
    course.title=title;
    course.duration=duration;
    course.students=students;
    return course;

}

function addProperty(object1,newProp,newValue){
    if(typeof(object1[newProp])=="undefined"){
        object1[newProp]=newValue;
        }
    return object1;

}



function canIGet (item,money){
    var items={'MacBook Air': 999,'MacBook Pro':1299,'Mac Pro':2499,'Apple Sticker':1};
    if(items[item]<=money){
        return true;
    }
    return false;
    

}

console.log(createCourse('Bloc Front-End Engineering', '4 weeks', ['Joe', 'Tim', 'Rob']));
console.log(addProperty({}, 'firstName', 'Jim'));
console.log(addProperty({firstName: 'Rob'}, 'firstName', 'Jim'));

console.log(canIGet('MacBook Air', 100) );
console.log(canIGet('MacBook Air', 1000));