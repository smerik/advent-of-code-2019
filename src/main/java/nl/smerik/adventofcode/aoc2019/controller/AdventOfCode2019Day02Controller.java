package nl.smerik.adventofcode.aoc2019.controller;

import nl.smerik.adventofcode.aoc2019.day.Day02Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/solutions/days/02")
public class AdventOfCode2019Day02Controller {

    private final Day02Service day02Service;

    public AdventOfCode2019Day02Controller(final Day02Service day02Service) {
        this.day02Service = day02Service;
    }

    @GetMapping("/part-01")
    public ResponseEntity<int[]> getSolutionPart01() {
        return ResponseEntity.ok(day02Service.getSolutionPart1());
    }

    @GetMapping("/part-02")
    public ResponseEntity<String> getSolutionPart02(@RequestParam final int requiredOutput) {
//        Path path = Paths.get("c:\\Users\\smerik\\IdeaProjects\\advent-of-code-2019\\src\\main\\resources\\day-02.txt");
//        String[] strings = Files.readString(path).replaceAll("\n", "").split(",");
//        int[] integers = Stream.of(strings).mapToInt(Integer::parseInt).toArray();

//        return ResponseEntity.ok(day02Service.solvePartTwo(integers, requiredOutput));
        return ResponseEntity.ok(day02Service.getSolutionPart2(requiredOutput));
    }
}
