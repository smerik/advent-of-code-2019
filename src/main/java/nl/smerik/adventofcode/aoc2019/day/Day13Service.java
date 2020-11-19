package nl.smerik.adventofcode.aoc2019.day;

import nl.smerik.adventofcode.aoc2019.model.IntcodeComputer;
import nl.smerik.adventofcode.aoc2019.model.arcade.ArcadeCabinet;
import nl.smerik.adventofcode.aoc2019.model.arcade.Tile;
import nl.smerik.adventofcode.aoc2019.service.PuzzleInputService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class Day13Service {

    private final PuzzleInputService puzzleInputService;

    @Value("classpath:input/day-13.txt")
    private Resource resource;

    public Day13Service(final PuzzleInputService puzzleInputService) {
        this.puzzleInputService = puzzleInputService;
    }

    public Long getSolutionPart1() {
        final long[] program = puzzleInputService.readIntcodeProgram(resource);
        final IntcodeComputer intcodeComputer = new IntcodeComputer(program);
        final ArcadeCabinet arcadeCabinet = new ArcadeCabinet(intcodeComputer);
        arcadeCabinet.draw();
        return arcadeCabinet.getScreen().countTilesByType(Tile.Type.BLOCK);
    }
}
