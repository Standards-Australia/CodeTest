function canScheduleAll(unloadingTimes) {
    throw Error("Waiting to be implemented");
}

function main() {
    let unloadingTimes = [
        { start: new Date("3/4/2019 19:00"), end: new Date("3/4/2019 20:30") },
        { start: new Date("3/4/2019 22:10"), end: new Date("3/4/2019 22:30") },
        { start: new Date("3/4/2019 20:30"), end: new Date("3/4/2019 22:00") }
    ];

    console.log(canScheduleAll(unloadingTimes));
}

main();